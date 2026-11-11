.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;


# instance fields
.field public 〺つふすそ:Ljava/lang/String;

.field public くし〴〺ぅ:Ljava/lang/String;

.field public final げつ〴ぬぐ:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/UUID;

    return-void
.end method

.method public static げつ〴ぬぐ(Ljava/util/UUID;)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;
    .registers 2

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    if-eqz v0, :cond_c

    iget-object v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->げつ〴ぬぐ:Ljava/util/UUID;

    invoke-virtual {v0, p0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :cond_c
    new-instance v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    invoke-direct {v0, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;-><init>(Ljava/util/UUID;)V

    sput-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    :cond_13
    sget-object p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざとぅぼこ〺;

    return-object p0
.end method
