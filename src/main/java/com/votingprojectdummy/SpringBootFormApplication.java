package com.votingprojectdummy;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.votingprojectdummy.model.Block;
import com.votingprojectdummy.model.User;
import com.votingprojectdummy.model.Votedata;
import com.votingprojectdummy.repository.UserRepo;
import com.votingprojectdummy.repository.VoteRepo;

@SpringBootApplication
public class SpringBootFormApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFormApplication.class, args);
	}

	@Autowired
	UserRepo userRepo;

	@Autowired
	VoteRepo voteRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {

		// Admin id and password

		User user1 = new User();
		user1.setUsername("admin");

		user1.setEmail("admin@gmail.com");
		user1.setPassword(passwordEncoder.encode("1234"));
		user1.setRole("ROLE_ADMIN");
		user1.setVotestatus("0");

		// this.userRepo.save(user1);

		// -------------------first block --------------------- //

		String[] initialValues = { "admin", null, "cpm" };
		String candidateHash = "0";
		Block candidate = new Block(initialValues, candidateHash);
		candidateHash = candidate.getBlockHash();

		Votedata initialvote = new Votedata();
		initialvote.setUsername("admin");
		initialvote.setPrevhash("0");
		initialvote.setCurrhash(candidateHash);
		Date date = new Date();
		initialvote.setDate(date);
		
		// this.voteRepo.save(initialvote);
		// voteRepo.copyData();
		// voteRepo.copyData(initialvote.getUsername(), initialvote.getCurrhash(), initialvote.getDate(), initialvote.getPrevhash());
		
		// System.out.println(firstPartyBlock.hashCode());
		// blockchain1.add(candidate);

	}

}
