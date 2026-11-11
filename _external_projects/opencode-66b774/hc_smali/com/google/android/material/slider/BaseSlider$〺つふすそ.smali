.class public Lcom/google/android/material/slider/BaseSlider$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/slider/BaseSlider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/google/android/material/slider/BaseSlider;


# direct methods
.method public constructor <init>(Lcom/google/android/material/slider/BaseSlider;Lcom/google/android/material/slider/BaseSlider$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/google/android/material/slider/BaseSlider$〺つふすそ;->くし〴〺ぅ:Lcom/google/android/material/slider/BaseSlider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/material/slider/BaseSlider$〺つふすそ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lcom/google/android/material/slider/BaseSlider$〺つふすそ;->くし〴〺ぅ:Lcom/google/android/material/slider/BaseSlider;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/slider/BaseSlider;->〳ぜぞぜべっ:Lcom/google/android/material/slider/BaseSlider$くし〴〺ぅ;

    .line 2
    iget v1, p0, Lcom/google/android/material/slider/BaseSlider$〺つふすそ;->〺つふすそ:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ;->ぇ〳〲〺すっ(II)Z

    return-void
.end method
