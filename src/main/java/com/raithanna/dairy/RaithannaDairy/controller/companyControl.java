package com.raithanna.dairy.RaithannaDairy.controller;

import com.raithanna.dairy.RaithannaDairy.models.bank;
import com.raithanna.dairy.RaithannaDairy.repositories.BankRepository;
import com.raithanna.dairy.RaithannaDairy.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
@Controller
public class companyControl {


        @Autowired
        private CompanyRepository companyRepository;
        @GetMapping("/createCompany")
        private String createCompanyForm(Model model, HttpSession session){
            company cmp =new company();
            model.addAttribute("company",cmp);
            return "createCompany";
        }
        @PostMapping("/createCompany")
        public String savecreateCompany(Model model,bank bn){
            companyRepository.save(cm);
            company c=new company();
            model.addAttribute("bank",c);
            return "createCompany";
        }

    }
}
