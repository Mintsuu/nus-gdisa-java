package com.workshop.customer.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
public class Customer {
  @Getter @Setter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Getter @Setter @NonNull
  private String name;
  @Getter @Setter @NonNull
  private String handPhoneNumber;
  @Getter @Setter @NonNull
  private String address;
}
