package com.github.avimoto.testing.services

import com.intellij.openapi.project.Project
import com.github.avimoto.testing.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
