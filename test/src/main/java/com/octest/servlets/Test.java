package com.octest.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;


@WebServlet("/Test")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Auteur auteur = new Auteur();
        auteur.setPrenom("Mathieu");
        auteur.setNom("Nebra");
        auteur.setActif(true);
        
        request.setAttribute("auteur", auteur);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }


}