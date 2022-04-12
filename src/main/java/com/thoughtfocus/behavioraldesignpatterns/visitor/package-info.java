package com.thoughtfocus.behavioraldesignpatterns.visitor;
/**
   In the Visitor Design Pattern we are going to use two methods. There are accept() method and visit() method.
The accept method accepts a visitor. It is provided by the visitable class. The visit() method is called every
time when we visit an element. This is implemented by the visitor class.

   The most common example of visitor pattern is shopping in the supermarket. In the supermarket, we pick the goods
and add them to our cart. When we collect all the necessary goods to the cart, we go to the bill desk for billing.
The cashier checks all the goods picked by us and tells us the total amount; we have to pay. Here, the cashier acts as
a visitor.
 */