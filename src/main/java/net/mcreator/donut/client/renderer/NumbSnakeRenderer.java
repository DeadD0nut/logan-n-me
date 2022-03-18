package net.mcreator.donut.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.donut.entity.NumbSnakeEntity;
import net.mcreator.donut.client.model.Modelcustom_model;

public class NumbSnakeRenderer extends MobRenderer<NumbSnakeEntity, Modelcustom_model<NumbSnakeEntity>> {
	public NumbSnakeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NumbSnakeEntity entity) {
		return new ResourceLocation("donut:textures/gummy.png");
	}
}
