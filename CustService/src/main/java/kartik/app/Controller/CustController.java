package kartik.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kartik.app.Entity.Customer;
import kartik.app.Service.CustService;

@RestController
@RequestMapping("/customer")
public class CustController {
	
	@Autowired
	private CustService service;
	
	
	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		System.out.print("Customer "+customer);
		Customer customer2 = service.addCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> addCustomer(@PathVariable String id)
	{
		Customer customer2 = service.getCustomerById(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> addCustomer()
	{
		List<Customer> customer2 = service.getAllCustomers();
		return ResponseEntity.status(HttpStatus.CREATED).body(customer2);
	}

}
