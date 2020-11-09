package com.mrwang.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.compile.JavaCompile
import org.aspectj.bridge.IMessage
import org.aspectj.bridge.MessageHandler
import org.aspectj.tools.ajc.Main
import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryPlugin

public class PluginImpl implements Plugin<Project> {
    void apply(Project project) {
        //得到当前module的插件类型，是application还是lib
        System.out.println("========================");
        System.out.println("Aspject开始编译!");
        System.out.println("========================");
        def hasApp = project.plugins.withType(AppPlugin)
        def hasLib = project.plugins.withType(LibraryPlugin)
        if (!hasApp && !hasLib) {
            throw new IllegalStateException("'android' or 'android-library' plugin required.")
        }

        final def log = project.logger
        final def variants
        if (hasApp) {
            variants = project.android.applicationVariants
        } else {
            variants = project.android.libraryVariants
        }

        project.dependencies {
            compile 'org.aspectj:aspectjrt:1.8.13'
        }

        variants.all {
            variant ->

                JavaCompile javaCompile = variant.javaCompile
                javaCompile.doLast {
                    String[] args = ["-showWeaveInfo",
                                     "-1.5",
                                     "-inpath", javaCompile.destinationDir.toString(),
                                     "-aspectpath", javaCompile.classpath.asPath,
                                     "-d", javaCompile.destinationDir.toString(),
                                     "-classpath", javaCompile.classpath.asPath,
                                     "-bootclasspath", project.android.bootClasspath.join(File.pathSeparator)]
                    log.debug "ajc args: " + Arrays.toString(args)

                    MessageHandler handler = new MessageHandler(true);
                    new Main().run(args, handler);
                    for (IMessage message : handler.getMessages(null, true)) {
                        switch (message.getKind()) {
                            case IMessage.ABORT:
                            case IMessage.ERROR:
                            case IMessage.FAIL:
                                log.error message.message, message.thrown
                                break;
                            case IMessage.WARNING:
                                log.warn message.message, message.thrown
                                break;
                            case IMessage.INFO:
                                log.info message.message, message.thrown
                                break;
                            case IMessage.DEBUG:
                                log.debug message.message, message.thrown
                                break;
                        }
                    }
                }
        }

        System.out.println("========================");
        System.out.println("Aspject编译结束!");
        System.out.println("========================");
    }
}