package org.realmind.controller;

import java.util.List;

import org.realmind.model.ManagerVO;
import org.realmind.service.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class ManageController {
    
    @Autowired
    private ManagerServiceImpl managerService;
    
    @GetMapping("/manager")
    public List<ManagerVO> getList(){
        System.out.println("list조회");
        List<ManagerVO> listVO = null;
        try {
            listVO = managerService.gerManagerList();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listVO;
    }
    
    @PostMapping("/manager")
    public String create(@RequestBody ManagerVO managerVO) {
        try {
            System.out.println("manager작성");
            managerService.createManager(managerVO);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "success";
    }
    
    @GetMapping("/manager/{id}")
    public ManagerVO search(@PathVariable int id) {
        System.out.println("id로 manager조회");
        ManagerVO managerVO = null;
        try {
            managerVO = managerService.searchManager(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return managerVO;
    }
    
    @PutMapping("/manager/{id}")
    public String update(@PathVariable int id) {
        String result = "fail";
        try {
            managerService.updateManager(id);
            result = "success";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
    @DeleteMapping("/manager/{id}")
    public String delete(@PathVariable int id) {
        String result = "fail";
        try {
            managerService.deleteManager(id);
            result = "success";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

}
