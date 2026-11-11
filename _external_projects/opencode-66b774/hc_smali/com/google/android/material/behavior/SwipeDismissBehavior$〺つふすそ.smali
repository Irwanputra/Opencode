.class public Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/behavior/SwipeDismissBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/View;

.field public final くし〴〺ぅ:Z

.field public final synthetic びぐびあび:Lcom/google/android/material/behavior/SwipeDismissBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->びぐびあび:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->〺つふすそ:Landroid/view/View;

    iput-boolean p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->くし〴〺ぅ:Z

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->びぐびあび:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->げつ〴ぬぐ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz v0, :cond_13

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ(Z)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->〺つふすそ:Landroid/view/View;

    invoke-static {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_1c

    :cond_13
    iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->くし〴〺ぅ:Z

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$〺つふすそ;->びぐびあび:Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1c
    :goto_1c
    return-void
.end method
