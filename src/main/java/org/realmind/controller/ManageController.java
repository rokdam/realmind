package org.realmind.controller;

import org.realmind.model.ManagerVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class ManageController {
    
    @PostMapping("/signUp")
    public String signUp(@RequestBody ManagerVO managerVO) {
        return "";
    }

}
