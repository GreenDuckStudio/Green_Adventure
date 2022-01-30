package de.greenduck.greenadventure.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class AerumOre extends Block {

    public AerumOre(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    protected void spawnDestroyParticles(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState) {
        for (int i = 0; i < 20; i++) {
            float xPos = pPos.getX() + (float) Math.random();
            float yPos = pPos.getY() + (float) Math.random();
            float zPos = pPos.getZ() + (float) Math.random();
            float xSpeed = (float) Math.random() /10;
            float ySpeed = (float) Math.random() /10;
            float zSpeed = (float) Math.random() /10;
            pLevel.addParticle(ParticleTypes.GLOW, xPos,yPos,zPos, xSpeed, ySpeed, zSpeed);
        }
        super.spawnDestroyParticles(pLevel, pPlayer, pPos, pState);
    }

    /*@Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, Random pRandom) {
        if(pLevel.isClientSide){
            pLevel.addParticle(ParticleTypes.FLAME, pPos.getX(),pPos.getY(),pPos.getZ(),0.5d,0d,0.5d);
        }
        super.animateTick(pState, pLevel, pPos, pRandom);
    }*/
}
