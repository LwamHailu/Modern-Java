package Lesson5;

import java.awt.Component;
import Lesson5.AddrWindow.*;

final public class AddressRuleSet implements RuleSet {

	AddressRuleSet() {
	}

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow) ob;
		if (addr.getIdValue().equals("") || addr.getStreetValue().equals("")
				|| addr.getZipValue().equals("") || addr.getStateValue().equals("")
				|| addr.getCityValue().equals(""))
			throw new RuleException("All fields must be nonempty!");
		else if (!addr.getIdValue().matches("\\d+"))
			throw new RuleException("ID field must be numeric!");

		else if (!addr.getZipValue().matches("\\d{5}"))
			throw new RuleException(
					"Zip must be numeric with exactly 5 digits!");

		else if (!addr.getStateValue().matches("[A-Z][A-Z]"))
			throw new RuleException(
					"State must have exactly two characters in the range A-Z!");
		else if (addr.getIdValue().equals(addr.getZipValue()))
			throw new RuleException("ID field may not equal zip field!");
	}

}
