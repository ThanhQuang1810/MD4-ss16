package org.example.baitap3.controller;

import org.example.baitap3.models.Employee;
import org.example.baitap3.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //Danh sách
    @RequestMapping
    public String listEmployee(Model model){
        model.addAttribute("employees",employeeService.getAll());
        return "list";
    }

    //Mở form add
    @RequestMapping("/add")
    public String showAddForm() {
        return "add";
    }

    //Thêm mới
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee){
        employeeService.add(employee);
        return "redirect:/";
    }

    //Mở form edit
    @RequestMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model){
        model.addAttribute("employee", employeeService.getById(id));
        return "edit";
    }

    //Chỉnh sửa
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editEmployee(@ModelAttribute Employee employee){
        employeeService.update(employee.getId(), employee);
        return "redirect:/";
    }

    // Chi tiết
    @RequestMapping("/details")
    public String showDetails(@RequestParam int id, Model model){
        model.addAttribute("employee", employeeService.getById(id));
        return "details";
    }

    // Mở form delete
    @RequestMapping("/delete")
    public String showDeleteForm(@RequestParam int id, Model model){
        model.addAttribute("employee", employeeService.getById(id));
        return "delete";
    }

    // Xóa
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteEmployee(@RequestParam int id){
        employeeService.delete(id);
        return "redirect:/";
    }
}
