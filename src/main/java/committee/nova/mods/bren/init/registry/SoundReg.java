package committee.nova.mods.bren.init.registry;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import committee.nova.mods.bren.Bren;

public class SoundReg {
    
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);
    
    public static final RegistryObject<SoundEvent> ITEM_MACHINE_GUN_SHOOT = registerSoundEvents("item.machine_gun.shoot");
    public static final RegistryObject<SoundEvent> ITEM_AUTO_GUN_SHOOT = registerSoundEvents("item.auto_gun.shoot");
    public static final RegistryObject<SoundEvent> ITEM_RIFLE_SHOOT = registerSoundEvents("item.rifle.shoot");
    public static final RegistryObject<SoundEvent> ITEM_RIFLE_SHOOT_SILENCED = registerSoundEvents("item.rifle.shoot_silenced");
    public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_SHOOT = registerSoundEvents("item.shotgun.shoot");
    public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_SHELL_INSERT = registerSoundEvents("item.shotgun.shell_insert");
    public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_RACK = registerSoundEvents("item.shotgun.rack");
    public static final RegistryObject<SoundEvent> ITEM_MACHINE_GUN_SHOOT_SILENCED = registerSoundEvents("item.machine_gun.shoot_silenced");
    public static final RegistryObject<SoundEvent> ITEM_AUTO_GUN_SHOOT_SILENCED = registerSoundEvents("item.auto_gun.shoot_silenced");
    public static final RegistryObject<SoundEvent> ITEM_DISTANT_GUNFIRE = registerSoundEvents("item.distant_gunfire");
    public static final RegistryObject<SoundEvent> ITEM_MAGAZINE_INSERT = registerSoundEvents("item.magazine_insert");
    public static final RegistryObject<SoundEvent> ITEM_MAGAZINE_REMOVE = registerSoundEvents("item.magazine_remove");
    public static final RegistryObject<SoundEvent> ITEM_REVOLVER_SHOOT = registerSoundEvents("item.revolver.shoot");
    public static final RegistryObject<SoundEvent> ITEM_REVOLVER_BULLET_INSERT = registerSoundEvents("item.revolver.bullet_insert");
    public static final RegistryObject<SoundEvent> ITEM_REVOLVER_RELOAD = registerSoundEvents("item.revolver.reload");
    public static final RegistryObject<SoundEvent> ITEM_REVOLVER_SPINNING = registerSoundEvents("item.revolver.spinning");
    public static final RegistryObject<SoundEvent> PARTICLE_CASING_BOUNCE = registerSoundEvents("particle.casing.bounce");

    public static final RegistryObject<SoundEvent> ENTITY_VILLAGER_WORK_GUNSMITH = registerSoundEvents("entity.villager.work_gunsmith");

    
    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Bren.MODID, name)));
    }
    
    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
