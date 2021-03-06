package ru.erked.aporogue.ru.erked.aporogue.systems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class ApoFont {

	private final float width = Gdx.graphics.getWidth();
	private BitmapFont font;

	public ApoFont(String path, int charAmount, Color textColor, float borderWidth, Color borderColor, String FONT_CHARS_RU){
		FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal(path));
		FreeTypeFontParameter param = new FreeTypeFontParameter();
		param.color = textColor;
		param.size = (int)(width/charAmount);
		param.characters = FONT_CHARS_RU;
		param.borderWidth = borderWidth;
		param.borderColor = borderColor;
		font = gen.generateFont(param);
		gen.dispose();
	}
	
	public ApoFont(String path, int charAmount, Color textColor, int shadowX, int shadowY, Color shadowColor, String FONT_CHARS_RU){
		FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal(path));
		FreeTypeFontParameter param = new FreeTypeFontParameter();
		param.color = textColor;
		param.size = (int)(width/charAmount);
		param.characters = FONT_CHARS_RU;
		param.shadowOffsetX = shadowX;
		param.shadowOffsetY = shadowY;
		param.shadowColor = shadowColor;
		font = gen.generateFont(param);
		gen.dispose();
	}
	
	public ApoFont(String path, int charAmount, Color textColor, String FONT_CHARS_RU){
		FreeTypeFontGenerator gen = new FreeTypeFontGenerator(Gdx.files.internal(path));
		FreeTypeFontParameter param = new FreeTypeFontParameter();
		param.color = textColor;
		param.size = (int)(width/charAmount);
		param.characters = FONT_CHARS_RU;
		font = gen.generateFont(param);
		gen.dispose();
	}
	
	public void setColor(Color color){
		font.setColor(color);
	}
	public float getWidth(String str){
		GlyphLayout layout = new GlyphLayout();
		layout.setText(font, str);
		return layout.width;
	}
	public float getHeight(String str){
		GlyphLayout layout = new GlyphLayout();
		layout.setText(font, str);
		return layout.height;
	}
	
	public void setScale(float scale){
		font.getData().setScale(scale);
	}
	public void draw(Batch batch, String str, float x, float y){
		font.draw(batch, str, x, y);
	}
	public void dispose(){
		font.dispose();
	}
	
}
