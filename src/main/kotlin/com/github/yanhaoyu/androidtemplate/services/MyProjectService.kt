package com.github.yanhaoyu.androidtemplate.services

import com.intellij.openapi.project.Project
import com.github.yanhaoyu.androidtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
