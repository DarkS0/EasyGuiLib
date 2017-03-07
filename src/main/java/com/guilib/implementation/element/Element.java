package com.guilib.implementation.element;

import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import com.guilib.api.element.IElement;
import com.guilib.api.element.events.IAction;
import com.guilib.api.element.listener.IActionListener;
import com.guilib.api.element.property.IAnimation;
import com.guilib.api.element.property.IElementValue;
import com.guilib.api.element.property.IMargin;
import com.guilib.api.element.property.IOutline;
import com.guilib.api.element.property.Padding;
import com.guilib.util.Vec2I;

public class Element implements IElement<Element>{
	
	@Nonnull
	private final Vec2I					position=new Vec2I();
	private int							width,height,innerWidth,innerHeight;
	@Nonnull
	private final Padding				padding	=new Padding(this);
	@Nonnull
	private IMargin						margin;
	@Nonnull
	private IOutline					outline;
	@Nonnull
	private IAnimation					animation;
	@Nonnull
	private Map<String,IElementValue>	elementValues;
	@Nonnull
	private Set<IActionListener>		actionListeners;
	
	private boolean dirty;
	
	public Element(){
		
	}
	
	public int getTop(){
		return position.x;
	}
	
	public int getLeft(){
		return position.y;
	}
	
	public int getBottom(){
		return position.y+width;
	}
	
	@Override
	public int getWidth(){
		return width;
	}
	
	@Override
	public void setWidth(int width){
		this.width=width;
	}
	
	@Override
	public int getHeight(){
		return height;
	}
	
	@Override
	public void setHeight(int height){
		this.height=height;
	}
	
	@Nonnull
	@Override
	public Padding getPadding(){
		return padding;
	}
	
	@Nonnull
	@Override
	public IMargin getMargin(){
		return margin;
	}
	
	@Override
	public void setMargin(@Nonnull IMargin margin){
		this.margin=margin;
	}
	
	@Nonnull
	@Override
	public IOutline getOutline(){
		return outline;
	}
	
	@Override
	public void setOutline(@Nonnull IOutline outline){
		this.outline=outline;
	}
	
	@Nonnull
	@Override
	public IAnimation getAnimation(){
		return animation;
	}
	
	@Override
	public void setAnimation(@Nonnull IAnimation animation){
		this.animation=animation;
	}
	
	@Nonnull
	@Override
	public Set<IElementValue> getExtendedProperties(){
		return extendedProperties;
	}
	
	@Nonnull
	@Override
	public IElement setValue(@Nonnull IElementValue property){
		extendedProperties.add(property);
		
		return this;
	}
	
	@Override
	public IElementValue getExtendedProperty(Class<? extends IElementValue> clazz){
		return extendedProperties.stream().filter(property->property.getClass().equals(clazz)).findFirst().get();
	}
	
	@Override
	public Set<IActionListener> getActionListeners(){
		return actionListeners;
	}
	
	@Override
	public IElement withActionListener(IActionListener listener){
		actionListeners.add(listener);
		
		return this;
	}
	
	@Override
	public IActionListener getActionListener(Class<? extends IAction> clazz){
		return actionListeners.stream().filter(listener->listener.getActionClass().equals(clazz)).findFirst().get();
	}

	@Override
	public IElementValue getValue(){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IActionListener getActionListener(Class clazz){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDirty(){
		return dirty;
	}

	@Override
	public void markDirty(){
		dirty=true;
	}
}
