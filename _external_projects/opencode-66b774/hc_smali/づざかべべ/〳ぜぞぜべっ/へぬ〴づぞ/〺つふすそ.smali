.class public interface abstract Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final げつ〴ぬぐ:Z


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    sput-boolean v0, Lづざかべべ/〳ぜぞぜべっ/へぬ〴づぞ/〺つふすそ;->げつ〴ぬぐ:Z

    return-void
.end method
