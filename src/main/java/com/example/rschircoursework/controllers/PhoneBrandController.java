package com.example.rschircoursework.controllers;

import com.example.rschircoursework.model.entity.PhoneBrand;
import com.example.rschircoursework.services.IPhoneBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/phoneBrand")
public class PhoneBrandController extends AbstractController<PhoneBrand, IPhoneBrandService>{
    @Autowired
    protected PhoneBrandController(IPhoneBrandService service) {
        super(service);
    }


    @GetMapping("/list")
    public String readingAll(Model model) {
        model.addAttribute("phoneBrands", service.getAll());
        return "admin/admin-phone_brand";
    }

    @GetMapping("/new")
    public String createPhoneBrand
            (Model model) {
        // create student object to hold student form data
        PhoneBrand phoneBrand = new PhoneBrand();
        model.addAttribute("phoneBrand", phoneBrand);
        return "admin/admin-phone_brand-add";

    }

    @PostMapping("/create")
    public String savePhoneBrand
            (@ModelAttribute("phoneBrand") PhoneBrand phoneBrand) {
        service.create(phoneBrand);
        return "redirect:/phoneBrand/list";
    }

    @GetMapping("/edit/{id}")
    public String editPhoneBrand
            (@PathVariable Long id, Model model) {
        model.addAttribute("phoneBrand", service.findById(id));
        return "admin/admin-phone_brand-edit";
    }

    @PostMapping("/{id}")
    public String updatePhoneBrand
            (@PathVariable Long id,
                            @ModelAttribute("phoneBrand") PhoneBrand phoneBrand,
                            Model model) {

        // get PhoneBrand
        // from database by id
        PhoneBrand existingPhoneBrand = service.findById(id);
        existingPhoneBrand.setId(id);
        existingPhoneBrand.setPhoneBrandName(phoneBrand.getPhoneBrandName());

        // save updated PhoneBrand
        // object
        service.update(id, existingPhoneBrand);
        return "redirect:/phoneBrand/list";
    }

    // handler method to handle delete student request

    @GetMapping("del/{id}")
    public String deletePhoneBrand
            (@PathVariable Long id) {
        service.delete(id);
        return "redirect:/phoneBrand/list";
    }
}
