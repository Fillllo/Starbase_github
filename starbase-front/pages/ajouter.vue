<template>
  <div class="d-flex w-100 justify-space-around h-100 text-center align-center ">
    <v-card @click="console.log('test')" width="200px" height="200px" variant="tonal" border="primary md" color="blue">
      <v-card-text class="d-flex flex-column align-center text-black">
        <div>
          <v-icon size="100" color="black">mdi-home-variant-outline</v-icon>
        </div>
        <b class="font-size-20 mt-3">Ajouter un site</b>
      </v-card-text>
    </v-card>
    <v-card @click="console.log('test')" width="200px" height="200px">
      <v-card-text class="d-flex flex-column align-center">
        <div>
          <v-icon size="100" color="black">mdi-firework</v-icon>
        </div>
        <b class="font-size-20 mt-3">Ajouter un booster</b>
      </v-card-text>
    </v-card>
    <v-card @click="console.log('test')" width="200px" height="200px">
      <v-card-text class="d-flex flex-column align-center">
        <div>
          <v-icon size="100" color="black">mdi-rocket</v-icon>
        </div>
        <b class="font-size-20 mt-3">Ajouter un ship</b>
      </v-card-text>
    </v-card>
  </div>
</template>

<script lang="ts" setup>

</script>

<style>

</style>