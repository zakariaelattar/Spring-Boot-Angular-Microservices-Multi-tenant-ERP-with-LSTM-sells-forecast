package org.sid.can_db_handler_service.Entites.Bank;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_bank_categ")
public class Bank_categ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private String label;
    private int entity;
}
