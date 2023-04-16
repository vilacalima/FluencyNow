package com.br.fluencynow.controller;

import com.br.fluencynow.DAO.AlunoDAO;
import com.br.fluencynow.model.Aluno;
import com.br.fluencynow.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class Cadastrar_controller {

    @RequestMapping("/cadastrar")
    public ModelAndView cadastrar() {

        return new ModelAndView("cadastrarAluno");
    }

    @RequestMapping("/cadastrarAluno")
    public String adicionaLogin(Aluno aluno, HttpSession session) throws SQLException {

        AlunoDAO alunoDAO = new AlunoDAO();

        if(aluno.dataNascimento == null)
            aluno.dataNascimento = new Date();

        if(alunoDAO.salvar(aluno)) {
            session.setAttribute("alunoCadastrado", aluno);
            return "welcome";
        }
        return "redirect:cadastrar";
    }

}
