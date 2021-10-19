package us.adgesh.routezips.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteZipsController {

    @GetMapping("/zip")
    public String getZip() {
        return "Your zip is 606014";
    }
}
