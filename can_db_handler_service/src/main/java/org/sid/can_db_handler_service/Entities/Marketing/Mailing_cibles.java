package org.sid.can_db_handler_service.Entities.Marketing;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_mailing_cibles")
public class Mailing_cibles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @ManyToOne
    private Mailing mailing;
    //foring key a faire  fk_contact		int(11)
    private String nom;
    private String prenom;
    private String email;
    private String other;
    private int statut;
    private String url;
    private Date date_envoi;
}
