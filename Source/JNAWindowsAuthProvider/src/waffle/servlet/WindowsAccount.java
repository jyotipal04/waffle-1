/*
 * Copyright (c) Application Security Inc., 2010
 * All Rights Reserved
 * Eclipse Public License (EPLv1)
 * http://waffle.codeplex.com/license
 */
package waffle.servlet;

import waffle.windows.auth.IWindowsAccount;

/**
 * A Windows Account used in a Windows principal.
 * @author dblock[at]dblock[dot]org
 */
public class WindowsAccount {
	
	private String _sidString;
	private String _fqn;
	private String _name;
	private String _domain;
	
	public WindowsAccount(IWindowsAccount account) {
		_sidString = account.getSidString();
		_fqn = account.getFqn();
		_name = account.getName();
		_domain = account.getDomain();
	}

	public String getSidString() {
		return _sidString;
	}

	public String getFqn() {
		return _fqn;
	}

	public String getName() {
		return _name;
	}

	public String getDomain() {
		return _domain;
	}
}