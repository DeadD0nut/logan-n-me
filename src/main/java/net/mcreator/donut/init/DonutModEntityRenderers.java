
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.donut.client.renderer.ShugerManRenderer;
import net.mcreator.donut.client.renderer.NumbSnakeRenderer;
import net.mcreator.donut.client.renderer.MonstereRenderer;
import net.mcreator.donut.client.renderer.FrostedBeastRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DonutModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DonutModEntities.BOW_2, ThrownItemRenderer::new);
		event.registerEntityRenderer(DonutModEntities.AAAAA, ThrownItemRenderer::new);
		event.registerEntityRenderer(DonutModEntities.MONSTERE, MonstereRenderer::new);
		event.registerEntityRenderer(DonutModEntities.FROSTED_BEAST, FrostedBeastRenderer::new);
		event.registerEntityRenderer(DonutModEntities.SHUGER_MAN, ShugerManRenderer::new);
		event.registerEntityRenderer(DonutModEntities.NUMB_SNAKE, NumbSnakeRenderer::new);
	}
}
