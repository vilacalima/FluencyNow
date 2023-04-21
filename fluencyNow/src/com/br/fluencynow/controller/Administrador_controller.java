package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Administrador_controller {

    @RequestMapping("/administrador")
    public ModelAndView administrador() {

        return new ModelAndView("administrador");
    }

    @RequestMapping(value = "/getAlunos", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        List<Aluno> alunos = AlunoDAO.getStundent();
        Aluno.Lista_container alunoList = new Aluno.Lista_container();
        alunoList.setAlunos(alunos);
        model.addAttribute("Alunos", alunoList);
        return "administrador";
    }

}
