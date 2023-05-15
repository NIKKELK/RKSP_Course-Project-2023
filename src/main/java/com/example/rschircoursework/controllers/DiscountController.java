package com.example.rschircoursework.controllers;

import com.example.rschircoursework.model.entity.Discount;
import com.example.rschircoursework.services.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/discount")
public class DiscountController extends AbstractController<Discount, IDiscountService>{
    @Autowired
    protected DiscountController(IDiscountService service) {
        super(service);
    }


    @GetMapping("/list")
    public String readingAll(Model model) {
        model.addAttribute("discounts", service.getAll());
        return "admin/admin-discount";
    }

    @GetMapping("/new")
    public String createDiscount
            (Model model) {
        // create student object to hold student form data
        Discount discount = new Discount();
        model.addAttribute("discount", discount);
        return "admin/admin-discount-add";

    }

    @PostMapping("/create")
    public String saveDiscount
            (@ModelAttribute("discount") Discount discount) {
        service.create(discount);
        return "redirect:/discount/list";
    }

    @GetMapping("/edit/{id}")
    public String editDiscount
            (@PathVariable Long id, Model model) {
        model.addAttribute("discount", service.findById(id));
        return "admin/admin-discount-edit";
    }

    @PostMapping("/{id}")
    public String updateDiscount
            (@PathVariable Long id,
                            @ModelAttribute("discount") Discount discount,
                            Model model) {

        // get Discount
        // from database by id
        Discount existingDiscount = service.findById(id);
        existingDiscount.setId(id);
        existingDiscount.setDiscountName(discount.getDiscountName());
        existingDiscount.setSale(discount.getSale());

        // save updated Discount
        // object
        service.update(id, existingDiscount);
        return "redirect:/discount/list";
    }

    // handler method to handle delete student request

    @GetMapping("del/{id}")
    public String deleteDiscount
            (@PathVariable Long id) {
        service.delete(id);
        return "redirect:/discount/list";
    }
}
