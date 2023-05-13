package com.br.fluencynow.controller;

import com.br.fluencynow.dao.AlunoDAO;
import com.br.fluencynow.dao.PlanoDAO;
import com.br.fluencynow.dto.AlunoDTO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Plano;
import com.br.fluencynow.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@Controller
public class Administrador_controller {


    @RequestMapping(value = "/administrador", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception{

        new com.br.fluencynow.service.AulaService().getAluno(model);
        new com.br.fluencynow.service.PlanoService().getPlano(model);
        new com.br.fluencynow.service.AulaService().getAulaEAluno(model);
        new com.br.fluencynow.service.AlunoService().quantidadeAluno(model);
        new com.br.fluencynow.service.AlunoService().aulasDisponiveis(model);
        new com.br.fluencynow.service.AlunoService().horasMinistradas(model);
        new com.br.fluencynow.service.AulaService().getRendimento(model);

        return "administrador";
    }
}
