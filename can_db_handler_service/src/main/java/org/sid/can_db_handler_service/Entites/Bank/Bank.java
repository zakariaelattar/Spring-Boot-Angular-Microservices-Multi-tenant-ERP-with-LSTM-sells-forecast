package org.sid.can_db_handler_service.Entites.Bank;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
