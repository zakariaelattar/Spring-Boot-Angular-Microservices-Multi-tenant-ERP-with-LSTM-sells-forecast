package org.sid.can_db_handler_service.Entities.User;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.sid.can_db_handler_service.Entities.Product.Product_fournisseur_price;
import org.sid.can_db_handler_service.Entities.Product.Product_fournisseur_price_log;
import org.sid.can_db_handler_service.Entities.Supplier.Commande_fournisseur_log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_user")
public class CanUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date datec;
    private Date tms;
    private String login;
    private int entity;
    private String pass;
    private String pass_crypted;
    private String pass_temp;
    private String name;
    private String firstname;
    private String office_phone;
    private String office_fax;
    private String user_mobile;
    private String email;
    private int admin;
    private String webcal_login;
    private String phenix_login;
    private String phenix_pass;
    private int module_comm;
    private int module_compta;
    /*foring key a faire
    private int fk_societe;
    end
    private int fk_sopeople;
    end
    private int fk_memebre;
    end
     */
    private String note;
    private Date datelastlogin;
    private Date datepreviouslogin;
    private Date egroupware_id;
    private String ldap_sid;
    private int statut;
    private String photo;
    private String lang;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Product_fournisseur_price> product_fournisseur_prices;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Product_fournisseur_price_log> product_fournisseur_price_logs;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Commande_fournisseur_log> commande_fournisseur_logs;
    @OneToOne
    private User_param user_param;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<User_rights> user_rights;
    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private Set<Usergroup_user> usergroup_users;
}
