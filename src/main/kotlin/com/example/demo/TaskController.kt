package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("tasks")
public class TaskController{

    @GetMapping("")
    fun index(model: Model): String{
        val tasks = listOf(
                Task(1, "障子を張り替える", true),
                Task(2, "定期検診に行く", false)
        )
        model.addAttribute("tasks",tasks)
        return "tasks/index"

    }
}