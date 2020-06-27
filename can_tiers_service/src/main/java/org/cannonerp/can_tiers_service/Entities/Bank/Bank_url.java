package org.cannonerp.can_tiers_service.Entities.Bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_bank_url")
public class Bank_url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    @OneToOne
    private Bank bank;
    private int url_id;
    private String url;
    private String label;
    private String type;
}
