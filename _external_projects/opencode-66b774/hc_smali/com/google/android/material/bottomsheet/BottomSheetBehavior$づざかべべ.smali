.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/View;

.field public くし〴〺ぅ:Z

.field public final synthetic づざかべべ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->づざかべべ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->〺つふすそ:Landroid/view/View;

    iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->づざかべべ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぇ〳〲〺すっ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    if-eqz v0, :cond_13

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->いいにぽつ(Z)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->〺つふすそ:Landroid/view/View;

    invoke-static {v0, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぅみぱぎぎ(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_1a

    :cond_13
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->づざかべべ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->びぐびあび:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->おかぷせ〱(I)V

    :goto_1a
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$づざかべべ;->くし〴〺ぅ:Z

    return-void
.end method
