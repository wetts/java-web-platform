package com.wetts.designpattern.composite.normal.transparent;

import java.util.List;

public class Leaf extends Component {

	@Override
	@Deprecated
	public void add(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Deprecated
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	@Deprecated
	public List<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

}
