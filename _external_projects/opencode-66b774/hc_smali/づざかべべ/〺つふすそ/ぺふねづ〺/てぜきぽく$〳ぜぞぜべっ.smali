.class public abstract Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "\u3033\u305c\u305e\u305c\u3079\u3063"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

.field public げつ〴ぬぐ:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract 〺つふすそ()Landroid/content/IntentFilter;
.end method

.method public abstract くし〴〺ぅ()I
.end method

.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_e

    :try_start_4
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_b} :catch_b

    :catch_b
    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/content/BroadcastReceiver;

    :cond_e
    return-void
.end method

.method public づざかべべ()V
    .registers 4

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ()V

    invoke-virtual {p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->〺つふすそ()Landroid/content/IntentFilter;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_10

    goto :goto_24

    :cond_10
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/content/BroadcastReceiver;

    if-nez v1, :cond_1b

    new-instance v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;)V

    iput-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/content/BroadcastReceiver;

    :cond_1b
    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->づざかべべ:Landroid/content/Context;

    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〳ぜぞぜべっ;->げつ〴ぬぐ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_24
    :goto_24
    return-void
.end method

.method public abstract びぐびあび()V
.end method
