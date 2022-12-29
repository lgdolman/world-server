// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//  Copyright (C) 2021 Trenton Kress
//  This file is part of project: Darkan
//
package com.rs.game.model.entity.actions;

import com.rs.game.model.entity.Entity;

public abstract class Action {
	public abstract boolean start(Entity entity);
	public abstract boolean process(Entity entity);
	public abstract int processWithDelay(Entity entity);
	public abstract void stop(Entity entity);
	

	public void setActionDelay(Entity entity, int delay) {
		entity.getActionManager().setActionDelay(delay);
	}
}
