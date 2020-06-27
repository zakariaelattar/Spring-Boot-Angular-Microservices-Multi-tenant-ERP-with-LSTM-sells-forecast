package org.cannonerp.can_purshase_sell_service.Bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cannonerp.can_purshase_sell_service.Entities.Categorie.Categorie;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_bank_class")
public class Bank_class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private int lineid;
    /*a verifier */
    @ManyToOne
    private Categorie categorie;
}
