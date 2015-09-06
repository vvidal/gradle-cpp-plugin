package com.tocea.gradle.plugins.cpp.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.TaskAction

/**
 * Created by jguidoux on 04/09/15.
 */
class CMakeTasks extends  DefaultTask {

   def cmakeOutput

    @TaskAction
    void customCmake() {
        def appArgs = project.cpp.cmake.cmakeArgs
        def userOutput = project.cpp.cmake.standardOutput

        project.exec {
           commandLine  "echo"

            if(appArgs){
                args appArgs.split('\\s')
            }
            if (userOutput) {
                standardOutput = userOutput
                cmakeOutput = userOutput
            }
        }

    }
}