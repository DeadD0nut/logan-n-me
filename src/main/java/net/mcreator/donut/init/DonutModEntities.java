
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.donut.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.donut.entity.ShugerManEntity;
import net.mcreator.donut.entity.NumbSnakeEntity;
import net.mcreator.donut.entity.MonstereEntity;
import net.mcreator.donut.entity.FrostedBeastEntity;
import net.mcreator.donut.entity.Bow2Entity;
import net.mcreator.donut.entity.AaaaaEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DonutModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<Bow2Entity> BOW_2 = register("entitybulletbow_2",
			EntityType.Builder.<Bow2Entity>of(Bow2Entity::new, MobCategory.MISC).setCustomClientFactory(Bow2Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AaaaaEntity> AAAAA = register("entitybulletaaaaa",
			EntityType.Builder.<AaaaaEntity>of(AaaaaEntity::new, MobCategory.MISC).setCustomClientFactory(AaaaaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MonstereEntity> MONSTERE = register("monstere",
			EntityType.Builder.<MonstereEntity>of(MonstereEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MonstereEntity::new).fireImmune().sized(1f, 1f));
	public static final EntityType<FrostedBeastEntity> FROSTED_BEAST = register("frosted_beast",
			EntityType.Builder.<FrostedBeastEntity>of(FrostedBeastEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostedBeastEntity::new).sized(1.4f, 0.9f));
	public static final EntityType<ShugerManEntity> SHUGER_MAN = register("shuger_man",
			EntityType.Builder.<ShugerManEntity>of(ShugerManEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(1310).setUpdateInterval(3).setCustomClientFactory(ShugerManEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<NumbSnakeEntity> NUMB_SNAKE = register("numb_snake",
			EntityType.Builder.<NumbSnakeEntity>of(NumbSnakeEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NumbSnakeEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MonstereEntity.init();
			FrostedBeastEntity.init();
			ShugerManEntity.init();
			NumbSnakeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MONSTERE, MonstereEntity.createAttributes().build());
		event.put(FROSTED_BEAST, FrostedBeastEntity.createAttributes().build());
		event.put(SHUGER_MAN, ShugerManEntity.createAttributes().build());
		event.put(NUMB_SNAKE, NumbSnakeEntity.createAttributes().build());
	}
}
