package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // No-op: não faz nada, apenas simula o envio
        System.out.println("DRY_RUN: Simulando envio de email para " + to + " - " + subject);
    }
}
