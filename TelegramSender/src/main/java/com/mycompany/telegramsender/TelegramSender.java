/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telegramsender;

import java.net.URI;

import java.net.URLEncoder;

import java.net.http.HttpClient;

import java.net.http.HttpRequest;

import java.net.http.HttpResponse;

import java.nio.charset.StandardCharsets;



public class TelegramSender {



    // PREENCHA COM SEUS DADOS

    private static final String BOT_TOKEN = "8446193755:AAFjRgfQNUavDOtCcWEDo1E8HBhZB4GeIow"; // Substitua pelo seu Token

    private static final String CHAT_ID = "@AchadosPremiun"; // Substitua pelo seu Chat ID (-100...)



    public static void main(String[] args) {

        String link = "https://mercadolivre.com/sec/2jxqnoK";

        String titulo = "Parafusadeira Furadeira De Impacto The Black Tools Profissional TB-21PX 2 Baterias Com Maleta 60Hz Amarelo";

        

        

        // Montando o corpo da mensagem com formatação Markdown

        String mensagem = String.format(

            "🔥 **NOVA PROMOÇÃO IMPERDÍVEL!** 🔥\n\n" +

            "Produto: *%s*\n\n" +

            "👉 [CLIQUE AQUI PARA COMPRAR](%s)",

            titulo,

            link

        );



        try {

            sendMessage(mensagem);

            System.out.println("Mensagem enviada com sucesso!");

        } catch (Exception e) {

            System.err.println("Erro ao enviar mensagem: " + e.getMessage());

            e.printStackTrace();

        }

    }



    public static void sendMessage(String text) throws Exception {

        // 1. Codificação da Mensagem: URLs não podem ter caracteres especiais sem codificação

        String encodedText = URLEncoder.encode(text, StandardCharsets.UTF_8);



        // 2. Construção da URL da API do Telegram (Método sendMessage)

        String urlString = String.format(

            "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s&parse_mode=Markdown",

            BOT_TOKEN, 

            CHAT_ID, 

            encodedText

        );



        // 3. Criação do Cliente HTTP e da Requisição

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create(urlString))

                .build();



        // 4. Envio da Requisição e Recebimento da Resposta

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());



        // 5. Verificação da Resposta

        if (response.statusCode() != 200) {

            throw new RuntimeException("Falha na API do Telegram. Status: " + response.statusCode() + ", Resposta: " + response.body());

        }

    }

}