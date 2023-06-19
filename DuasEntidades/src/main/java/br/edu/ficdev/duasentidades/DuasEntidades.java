/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ficdev.duasentidades;

/**
 *
 * @author pedroclarindodasilvaneto
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DuasEntidades {

private static final String PERSISTENCE_UNIT_NAME = "NutricionistaPU";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityManager = factory.createEntityManager();

        // Iniciar uma transação
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // Criação de um nutricionista
            Nutricionista nutricionista = new Nutricionista();
            nutricionista.setNome("João Silva");
            nutricionista.setCrn("12345");
            nutricionista.setUuid(1);

            // Criação de uma receita
            Receita receita = new Receita();
            receita.setNomeReceita("Receita de Remédio");
            receita.setNumeroIngredientes(3);
            receita.setNutricionista(nutricionista);


            // Persistir o nutricionista
            entityManager.persist(nutricionista);
            entityManager.persist(receita);

            // Commit da transação
            transaction.commit();

            System.out.println("Dados persistidos com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            // Rollback da transação em caso de erro
            transaction.rollback();
        } finally {
            // Fechar o EntityManager e o EntityManagerFactory
            entityManager.close();
            factory.close();
        }
    }
}
