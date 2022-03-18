package net.mcreator.donut.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.donut.entity.FrostedBeastEntity;

public class FrostedBeastRenderer extends MobRenderer<FrostedBeastEntity, SpiderModel<FrostedBeastEntity>> {
	public FrostedBeastRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrostedBeastEntity entity) {
		return new ResourceLocation("donut:textures/cave_spider.png");
	}
}
