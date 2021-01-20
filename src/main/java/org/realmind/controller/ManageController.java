package org.realmind.controller;

import org.realmind.model.ManagerVO;
import org.realmind.service.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class ManageController {
    
    @Autowired
    private ManagerServiceImpl managerService;
    
    @PostMapping("/signUp")
    public String signUp(@RequestBody ManagerVO managerVO) {
        try {
            System.out.println(managerVO);
            managerService.createManager(managerVO);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "success";
    }

}
