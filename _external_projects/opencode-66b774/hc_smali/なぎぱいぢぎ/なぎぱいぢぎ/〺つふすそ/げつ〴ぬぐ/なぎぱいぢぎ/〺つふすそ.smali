.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/dynamite/DynamiteModule$びぐびあび;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;
    .registers 7

    new-instance v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;

    invoke-direct {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;-><init>()V

    const/4 v1, 0x1

    invoke-interface {p3, p1, p2, v1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v2

    iput v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->〺つふすそ:I

    if-eqz v2, :cond_11

    iput v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:I

    goto :goto_1c

    :cond_11
    invoke-interface {p3, p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;->〺つふすそ(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:I

    if-eqz p1, :cond_1c

    const/4 p1, -0x1

    iput p1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->くし〴〺ぅ:I

    :cond_1c
    :goto_1c
    return-object v0
.end method
