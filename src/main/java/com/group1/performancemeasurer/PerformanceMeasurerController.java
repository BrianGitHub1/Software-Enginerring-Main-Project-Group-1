package com.group1.performancemeasurer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerformanceMeasurerController {

    @GetMapping("/performanceMeasurer")
    public String performanceMeasurerGUI(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "performanceMeasurerGUI";
    }

}
