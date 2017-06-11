package Lesson5;

import java.awt.Component;

//import Lesson5.window.*;

final public class CustomerProfileRuleSet implements RuleSet {

	public CustomerProfileRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow prof = (ProfileWindow) ob;

		if (prof.getFirstNameValue().equals("")
				|| prof.getLastNameValue().equals("")
				|| prof.getIdValue().equals("")
				|| prof.getFavoriteRestaurantValue().equals("")
				|| prof.getFavoriteMovieValue().equals(""))
			throw new RuleException("All fields must be nonempty!");
		else if (!prof.getIdValue().matches("\\d+"))
			throw new RuleException("ID field must be numeric!");

		else if (!prof.getFirstNameValue().matches("[a-zA-Z]+")
				|| !prof.getLastNameValue().matches("[a-zA-Z]+"))
			throw new RuleException(
					"firstname and lastname fields may not contain spaces or characters other than a-z, A-Z!");
		else if (prof.getFavoriteMovieValue().equals(
				prof.getFavoriteRestaurantValue()))
			throw new RuleException("Favorite restaurant cannot equal favorite movie!");
	}

}
