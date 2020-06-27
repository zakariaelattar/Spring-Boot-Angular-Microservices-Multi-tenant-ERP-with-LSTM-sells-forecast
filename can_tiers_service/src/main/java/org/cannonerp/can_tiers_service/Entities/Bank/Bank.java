package org.cannonerp.can_tiers_service.Entities.Bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date datec;
    private Date datev;
    private Date dateo;
    private double amount;
    private String label;
    /*foring key a faire
    fk_account		int(11)
    fk_user_author		int(11)
    fk_user_rappro		int(11)
    fk_type			varchar(4)
    end
     */
    private String num_releve;
    private String num_chq;
    private int rappro;
    private String note;
    /*foring key a faire
    fk_bordereau		int(11)
    end
     */
    private String banque;
    private String emetteur;
    private String author;
    @OneToOne
    private Bank_url bank_url;
}
