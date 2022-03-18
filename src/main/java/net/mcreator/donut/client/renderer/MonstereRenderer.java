package net.mcreator.donut.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.donut.entity.MonstereEntity;

public class MonstereRenderer extends MobRenderer<MonstereEntity, GhastModel<MonstereEntity>> {
	public MonstereRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MonstereEntity entity) {
		return new ResourceLocation("donut:textures/ghast.png");
	}
}
